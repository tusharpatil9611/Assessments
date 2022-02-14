package CallByValueOrCallByRefrance;

public class CallByRefrance {
	  int a,b;
	  CallByRefrance(int i,int j)
      {  
    	 this.a=i;
         this.b=j;
      }
      void meth( CallByRefrance of)
      {   
    	  of.a=a*2;
          of.b=b/2;
      }
  }
  
