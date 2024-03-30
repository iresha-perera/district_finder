import java.util.Scanner;
class ProvincialData{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the number of provinces in Sri Lanka :");
		int provinces = scan.nextInt();
		
		System.out.println("");
		System.out.println("Please use the following guides");
		System.out.println("");
		
		System.out.println("Western Provinc        : 1");
		System.out.println("Central Province        : 2 ");
		System.out.println("Northern Province       : 3 ");
		System.out.println("Southern Province       : 4 ");
		System.out.println("Eastern Province        : 5 ");
		System.out.println("North Central Province  : 6 ");
		System.out.println("North Western Province  : 7 ");
		System.out.println("Sabaragmuwa Province    : 8 ");
		System.out.println("Uva Province            : 9 ");
		
		System.out.println("");
		
		System.out.println("Type the number corresponding to the province in order to view the districts belonging that particular province");
		System.out.println("");
		
		while(true){
		System.out.print("Enter the provincial code :");
		int code = scan.nextInt();
		
	
		String westernProvince =  "Colombo | Kalutara | Gampaha";
		String centralProvince =  "Kandy | Matale | Nuwaraeliya";
		String northernProvince = "Jaffna | Kilinochchi | Vavuniya | Mannar";
		String southernProvince = "Galle | Hambanthota | Matara";
		String easternProvince =  "Ampara | Trincomalee | Batticaloa";
		String northcentralProvince = "Anuradhapura | Polonnauwa |";
		String northwesternProvince = "Kurunegala | Puttalam |";
		String sabaragamuwaProvince = "Kegalle | Ratnapura |";
		String uvaProvince = "Badulla | Monaragala |";
		
		System.out.println("");
		
		
			if(code==1){
				System.out.println("Western Province of Sri Lanka");
				System.out.println("The districts of this province are : "+westernProvince );
				System.out.println("");
				}else if(code==2){
					System.out.println("Central Province of Sri Lanka");
				System.out.println("The districts of this province are : "+centralProvince );
				System.out.println("");
					}else if(code==3){
					System.out.println("Northern Province of Sri Lanka");
				System.out.println("The districts of this province are : "+northernProvince );
				System.out.println("");
					}else if(code==4){
					System.out.println("Southern Province of Sri Lanka");
				System.out.println("The districts of this province are : "+southernProvince );
				System.out.println("");
					}else if(code==5){
					System.out.println("Eastern Province of Sri Lanka");
				System.out.println("The districts of this province are : "+easternProvince );
				System.out.println("");
					}else if(code==6){
					System.out.println("North Central Province of Sri Lanka");
				System.out.println("The districts of this province are : "+northcentralProvince );
				System.out.println("");
					}else if(code==7){
					System.out.println("North Western Province of Sri Lanka");
				System.out.println("The districts of this province are : "+northwesternProvince );
				System.out.println("");
					}else if(code==8){
					System.out.println("Sabaragamuwa Province of Sri Lanka");
				System.out.println("The districts of this province are : "+sabaragamuwaProvince );
				System.out.println("");
					}else if(code==9){
					System.out.println("Uva Province of Sri Lanka");
				System.out.println("The districts of this province are : "+uvaProvince );
				System.out.println("");
					}
			
		}
		}
	}
