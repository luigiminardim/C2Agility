package roles.chart;

import repast.simphony.statecharts.*;
import repast.simphony.parameter.Parameters;
import static repast.simphony.random.RandomHelper.*;
import repast.simphony.statecharts.generator.GeneratedFor;

import static repast.simphony.essentials.RepastEssentials.*;

import entities.*;

/**
 * Guard for Transition 55, from = Reallocating, to = Running.
 */
@GeneratedFor("_fiV1gJSaEeqUuepXYUrgtg")
public class SC2Guard4 implements GuardCondition<Drone> {
	@Override
	public boolean condition(Drone agent, Transition<Drone> transition, Parameters params) throws Exception {
		return ((agent.isExecutor() != null) && (!agent.isExecutor().isReallocating()));

	}
}
