package adarsh.qwe;
import java.util.*;
class empl //parent class
{
        Integer eid;
        String name,salary;
        Hashtable<Integer,Hashtable<String,String>> etable=new Hashtable<Integer,Hashtable<String,String>>();
        void empdelete( int e,Hashtable<Integer,Hashtable<String,String>>etable)//deleting employee
        {
            System.out.println(e);
            etable.remove(e);
            System.out.println(etable);
        }
        void empmodify(int e,Hashtable<Integer,Hashtable<String,String>>etable){//modify employee
          Hashtable<String,String> etab=null;
          Scanner in=new Scanner(System.in);
          System.out.println(e);
          etab=etable.get(e);
          System.out.println("Enter new name");
          name=in.nextLine();
          etab.put("name",name);
          System.out.println(etable);
        }
        void empsearch(int e,Hashtable<Integer,Hashtable<String,String>>etable){//search employee
            System.out.println(e);
            System.out.println(etable);
            if(etable.containsKey(e))
            {
                System.out.print("employee id found in table");
            }
            else{
                System.out.println("doesnt contain");
            }
      
      
      
        }




}
class pemployee extends empl  //permanant employee class
{

   
    Hashtable<Integer,Hashtable<String,String>> empstore()//for creating employee
    {
  
      etable=etable;
      Hashtable<String,String> etab=new Hashtable<String,String>();
      Scanner in=new Scanner(System.in);
      System.out.println("enter name");
      name=in.nextLine();
      System.out.println("Enter id");
      eid=in.nextInt();
     
  
      etab.put("name",name);    
      etab.put("type","permanant");
      
      
        etable.put(eid,etab);
    
      System.out.println(etable);
      return etable;
      
    }
}
class cemployee extends empl //contract employee class
{

   
    Hashtable<Integer,Hashtable<String,String>> empstore(Hashtable<Integer,Hashtable<String,String>>etable)//for creating employee
    {
  
      etable=etable;
      Hashtable<String,String> etab=new Hashtable<String,String>();
      Scanner in=new Scanner(System.in);
      System.out.println("enter name");
      name=in.nextLine();
      System.out.println("Enter id");
      eid=in.nextInt();
     
  
      etab.put("name",name);    
      etab.put("type","contract");
      
      
        etable.put(eid,etab);
    
      System.out.println(etable);
      return etable;
      
    }
}
class partemployee extends empl //parttime employee calss
{

   
    Hashtable<Integer,Hashtable<String,String>> empstore(Hashtable<Integer,Hashtable<String,String>>etable)//for creating employee
    {
  
      etable=etable;
      Hashtable<String,String> etab=new Hashtable<String,String>();
      Scanner in=new Scanner(System.in);
      System.out.println("enter name");
      name=in.nextLine();
      System.out.println("Enter id");
      eid=in.nextInt();
     
  
      etab.put("name",name);    
      etab.put("type","parttime ");
      
      
        etable.put(eid,etab);
    
      System.out.println(etable);
      return etable;
      
    }
}
public class a{ //main class
    public static void main(String[] args) {
        Integer n,c,t,e;
        Hashtable<Integer,Hashtable<String,String>> et=null ;
        Scanner in=new Scanner(System.in);
        empl e1=new empl();
        pemployee e2=new pemployee();
        cemployee e3=new cemployee();
        partemployee e4=new partemployee();
        
        do{
        System.out.println("\n1.create\n2.modify\n3.delete\n4.search\n5. exit\nchoose your option");
        c=in.nextInt();
        switch (c) {
           
        case 1:
        
            System.out.println("Which type employ do you  want to add    1.permanant 2.contract 3. parttime");
            t=in.nextInt();
            if(t==1)
            {
                 // e2.empstore();
                et=e2.empstore();
            }

            else if(t==2)
            {
                                        
                 e3.empstore(et);
            }
            else if(t==3)
            {
                e4.empstore(et);
            }
                            

            break;

       case 2:
            System.out.println("Enter emplyee id want to modify");
            e=in.nextInt();
            e1.empmodify(e,et);
            break;
       case 3:
            System.out.println("Enter emplyee id want to delete");
            e=in.nextInt();
            e1.empdelete(e,et);
            break;
        case 4:
            System.out.println("Enter emplyee id want to search");
            e=in.nextInt();
            e1.empsearch(e,et);
            break;
        case 5:
               break;

        default:
            System.out.println("Invalid Choice .. Try Again.");
        }   
    }while(c!=5);
    }
    }
    

