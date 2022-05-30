import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class RallyScreen {


   private final Function1 body;


   public final void content(@NotNull Function1 onScreenChange) {
      this.body.invoke(onScreenChange);
   }


   private RallyScreen( Function1 body) {
      this.body = body;
   }

   static Function1 function1=new Function1() {
      @Override
      public Object invoke(Object o) {
         System.out.println("内部的初始化");
         return o;
      }
   };


   public static void main(String[] args) {
      new RallyScreen(function1).content(new Function1() {
         @Override
         public Object invoke(Object o) {
            System.out.println("要执行的");
            return o;
         }
      });
   }
}