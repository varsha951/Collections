/*2) There are vehicles. Vehicle has a name and an engine capacity [like 100bhp, 200bhp 
etc => take as int] and provide parameterised constructor. Create a Tester class, create 
2 Vehicle objects with same state and invoke v1.equals(v2) and verify what you get as 
result? Why are you getting that result? 
A vehicle is equal to another if both the name and capacity are the same. Override 
equals() method in Vehicle to implement this functionality. Put SOP in equals() with 
something like SOP(“Vehicle->equals()->testing…”) and concat the states of the two objects into sop. 
In a tester class, create two vehicle objects, invoke equals on it and find 
out whether object equality check is working correctly. Create an ArrayList object, add 
first vehicle ref and check if the contains(second ref) returns true or not => it 
should return true as equality check would be used to search*/

package com.uis.Q2;
import java.util.Objects;

public class Vehicle {
	
	String name;
	int engineCapacity_bhp;
	
	@Override
	public int hashCode() {
		return Objects.hash(engineCapacity_bhp, name);
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", engineCapacity_bhp=" + engineCapacity_bhp + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return engineCapacity_bhp == other.engineCapacity_bhp && Objects.equals(name, other.name);
	}

	public Vehicle(String name, int engineCapacity_bhp) {
		super();
		this.name = name;
		this.engineCapacity_bhp = engineCapacity_bhp;
	}
	

}