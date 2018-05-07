package sh.calaba.instrumentationbackend.actions.device;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.By;
import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;

/**
* Created by benjamin jerome on 5/4/18.
*/
public class UiautomatorFindElement implements Action {
   @Override
   public Result execute(String... args) {
       int timeout = 30000;
       int delay = 1000;
       long time = System.currentTimeMillis();

       UiObject2 element = InstrumentationBackend.getUiDevice().findObject(By.res(args[0]));

       return new Result(true);

   }
   @Override
   public String key() {
       return "find_my_element";
   }
}
