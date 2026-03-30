package funint;
class VoterList{
	void checkVoterName(int ageValue);
	if(age>18) {
		System.out.println("you can vote");
	}else {
		System.out.println("you can't vote");

	}

}
}




@FunctionalInterface 
interface Voter{
	void checkVoter(int age);
	

}
public class voterMain {

	public static void main(String[] args) {
		if(age>18) {
			System.out.println("you can vote");
		}else {
			System.out.println("you can't vote");

		}

		// TODO Auto-generated method stub
		Voter v= age ->{
					};
		v.checkVoter(20);
//		VoterList v1= new VoterList();
//		Voter v1= v1:: checkVoterName;//
//		v1.checkVoter(17);
	}	

}



