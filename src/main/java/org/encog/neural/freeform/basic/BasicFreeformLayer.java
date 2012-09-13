package org.encog.neural.freeform.basic;

import java.util.ArrayList;
import java.util.List;

import org.encog.neural.freeform.FreeformLayer;
import org.encog.neural.freeform.FreeformNeuron;

public class BasicFreeformLayer implements FreeformLayer {
	
	private List<FreeformNeuron> neurons = new ArrayList<FreeformNeuron>();

	@Override
	public List<FreeformNeuron> getNeurons() {
		return this.neurons;
	}

	@Override
	public int size() {
		return this.neurons.size();
	}

	@Override
	public void add(FreeformNeuron basicFreeformNeuron) {
		this.neurons.add(basicFreeformNeuron);		
	}

	@Override
	public void setActivation(int i, double activation) {
		this.neurons.get(i).setActivation(activation);
	}

	@Override
	public int sizeNonBias() {
		int result = 0;
		for(FreeformNeuron neuron: this.neurons) {
			if( !neuron.isBias() ) {
				result++;
			}
		}
		return result;
	}
	
}