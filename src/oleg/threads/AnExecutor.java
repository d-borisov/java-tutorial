package oleg.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AnExecutor {

  public static void main(String[] args) {
    Runnable r = null;

    Executor e = null;
    e.execute(r);

    ExecutorService es = null;
    Future<?> submit = es.submit(r);
    try {
      submit.get();
    } catch (InterruptedException | ExecutionException e1) {
      e1.printStackTrace();
    }

    ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
    ses.schedule(r, 10, TimeUnit.SECONDS);

  }
}
