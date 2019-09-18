
public class RemoveDublicateChar {

   public static void main(String x[])
   {
       
       String s1=new String("bilimora");
       String s2=new String("bi");
       
       char x1[]=new char[s1.length()];
       char x2[]=new char[s2.length()];
       char x3[]=new char[6];
       s1.getChars(0, s1.length(), x1, 0);
       s2.getChars(0, s2.length(), x2, 0);
       
      int i,j,k=0;
      int flag;
        for(i=0; i<x1.length; i++)
        {
             flag=0;
        
           for(j=0; j < x2.length; j++)
           {
               if(x1[i] == x2[j])
                       {
                           flag=1;
                           break;
                       }
               
           }
           if(flag==0)
           x3[k++]=x1[i];    
        }  
        System.out.println(x3);
        
        
   }

}
