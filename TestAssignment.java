package com.winvector.comb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import com.winvector.linalg.LinalgFactory;
import com.winvector.linalg.colt.ColtMatrix;
import com.winvector.linalg.colt.NativeMatrix;
import com.winvector.linalg.jblas.JBlasMatrix;
import com.winvector.lp.apachem3.M3Solver;

public class TestAssignment {
	private static final ArrayList<LinalgFactory<?>> factories = new ArrayList<LinalgFactory<?>>();
	static {
		factories.add(NativeMatrix.factory);
		factories.add(ColtMatrix.factory);
		factories.add(JBlasMatrix.factory);
	};
	
	@Test
	public void testAssignment() {
		for(final LinalgFactory<?> f: factories) {
			final double[][] c = {
					{ 1, 10, Double.NaN },
					{ 1, Double.NaN, 4 },
					{ 3, 100, 3 }
			};
			final int[] assignment = Assignment.computeAssignment(c,1000,f);
			assertNotNull(assignment);
			final boolean valid = Assignment.checkValid(c,assignment);
			assertTrue(valid);
			final int[] expect = {1, 0, 2};
			assertEquals(expect.length,assignment.length);
			for(int i=0;i<expect.length;++i) {
				assertEquals(expect[i],assignment[i]);
			}
		}
	}

	@Test
	public void testRandAssignment() {
		for(final LinalgFactory<?> f: factories) {
			final int n = 20;
			final Random rand = new Random(235135L);
			final int reps = 10;
			for(int rep=0;rep<reps;++rep) {
				final double[][] c = new double[n][n];
				for(int i=0;i<n;++i) {
					for(int j=0;j<n;++j) {
						c[i][j] = rand.nextDouble();
					}
				}
				for(int splotch=0;splotch<n-1;++splotch) {
					c[rand.nextInt(n)][rand.nextInt(n)] = Double.NaN;
				}
				final int[] assignment = Assignment.computeAssignment(c,1000,f);
				assertNotNull(assignment);
				final boolean valid = Assignment.checkValid(c,assignment);
				assertTrue(valid);
				final double solnCost = Assignment.cost(c,assignment);
				final int[] check = Assignment.computeAssignment(c,f, new M3Solver(), 1000);
				final double checkCost = Assignment.cost(c,check);
				final double relAbsDiff = Math.abs(solnCost-checkCost)/Math.max(1.0,Math.abs(checkCost));
				//System.out.println("\t" + solnCost + "\t" + checkCost + "\t" + relAbsDiff);
				assertTrue(relAbsDiff<1.0e-2);
			}
		}
	}
}