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
* Created by Ben Jerome on 05/03/18.
*/
public class UiautomatorWaitForScreen implements Action {
   private  boolean isVisible = false;

   @Override
   public Result execute(String... args) {
       isVisible = InstrumentationBackend.getUiDevice().waitForWindowUpdate(args[0], Long.parseLong(args[1]));
       return new Result(isVisible);

      }


   public String key() {
       return "wait_for_screen";
   }
}
