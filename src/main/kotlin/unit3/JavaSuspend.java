package unit3;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;

public class JavaSuspend {
    public static void main(String[] args) {

      SnippetKtKt.notSuspend(new Continuation<Integer>() {
          @NotNull
          @Override
          public CoroutineContext getContext() {
              return EmptyCoroutineContext.INSTANCE;
          }

          @Override
          public void resumeWith(@NotNull Object o) {
              System.out.println("resume With method");
          }
      });
    }
}
