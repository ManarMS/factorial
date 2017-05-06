
import java.util.Scanner;//جملة استدعاء


public class Factorial {
    public static void main(String[] args) {
     //سنقوم بتعريف متغيرين هنا واعطاء قيمة اولية 
     
     int c,factorial=1;
        System.out.println("enter an enteger to find a factorial ");
        Scanner in =new Scanner(System.in);//كونسركتر من كلاس سكانر 
        int n=in.nextInt();
        if (n<0){//هنا وضعنا شرط لمتغير
            System.out.println("the number should be positive ");//يطبع الاعداد الموجبة 
        }
        
        else{
            for(c=1;c<=n;c++){//هنا حددنا كيف الحلقة راح تعمل
             factorial =factorial*n;
             
            }
            System.out.println("factorial of "+n+"is "+factorial);//هنا ستطبع لنا فكتوريا وقيمة الاعداد
        }
        
        
    }

}
          