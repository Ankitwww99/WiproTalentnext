package MiniProject;
/*
mini project 1
*/
//this is the structure for employee details table
class empDetails{
    int EmpNo,Basic,HRA,IT;
    String Name,JoinDate,Department;
    char DesignationCode;

    public empDetails(int empNo,  String name,  String joinDate, char designationCode, String department, int basic, int HRA, int IT) {
        EmpNo = empNo;
        Basic = basic;
        this.HRA = HRA;
        this.IT = IT;
        Name = name;
        JoinDate = joinDate;
        Department = department;
        DesignationCode = designationCode;
    }

}
// this is the structure for Designation table
class designation{
    char DesignationCode;
    String Designation;
    int DA;

    public designation(char designationCode, String designation, int DA) {
        DesignationCode = designationCode;
        Designation = designation;
        this.DA = DA;
    }

}
public class Project1 {
    public static void main(String[] args) {

        //array of employee details is initialised
        empDetails[] ed=new empDetails[7];

        //detail of each row is inserted
        ed[0]=new empDetails(1001,"Ashish","01/04/2009",'e',"R&D",20000,8000,3000);
        ed[1]=new empDetails(1002,"Sushma","23/08/2012",'c',"PM",30000,12000,9000);
        ed[2]=new empDetails(1003,"Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
        ed[3]=new empDetails(1004,"Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
        ed[4]=new empDetails(1005,"Ranjan","16/07/2005",'m',"Engg",50000,20000,20000);
        ed[5]=new empDetails(1006,"Suman","01/01/2000",'e',"Manufacturing",9000,8000,4400);
        ed[6]=new empDetails(1007,"Tanmay","12/06/2006",'c',"PM",29000,12000,10000);

        //array of designation table is initialised
        designation[] da=new designation[5];

        //details of each row is inserted
        da[0]=new designation('e',"Engineer",20000);
        da[1]=new designation('c',"Consultant",32000);
        da[2]=new designation('k',"Clerk",12000);
        da[3]=new designation('r',"Receptionist",15000);
        da[4]=new designation('m',"Manager",14000);

        //converting employee to integer
        int sEmpID=Integer.parseInt(args[0]);
        //flag variable is for checking employee id exists or not
        boolean flag=false;
        //pED will store row no of employee table which have given emp ID
        int pED=0;
        for (int i = 0; i <ed.length; i++) {
            if(sEmpID==ed[i].EmpNo){
                flag=true;
                pED=i;
                break;
            }
        }
        // if emp id doesn't exists print below msg
        if(!flag){
            System.out.println("There is no employee with empid :"+sEmpID);
        }
        // proceed further
        else{
            //pDA will store row no of designation table which have co-responding designation code of given emp ID
            int pDA=0;
            for (int i = 0; i < da.length; i++) {
                if (ed[pED].DesignationCode == da[i].DesignationCode) {
                    pDA = i;
                    break;
                }
            }
            //sal calculate the salary of the given emp ID
            int sal = ed[pED].Basic+ed[pED].HRA+da[pDA].DA-ed[pED].IT;
            System.out.println(ed[pED].EmpNo+" "+ed[pED].Name+" "+ed[pED].Department+" "+da[pDA].Designation+" "+sal);
        }


    }
}
