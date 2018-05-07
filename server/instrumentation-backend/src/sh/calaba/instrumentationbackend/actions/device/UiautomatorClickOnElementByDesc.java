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
 * Created by rajdeepvarma on 10/12/16.
 */
public class UiautomatorClickOnElementByDesc implements Action {
    private UiObject2 element;
    @Override
    public Result execute(String... args) {
        element = InstrumentationBackend.getUiDevice().findObject(By.desc(args[0]));
//        try {
//
           element.click();
//        } catch (UiObjectNotFoundException e) {
//            String message = e.getMessage();
//            return Result.failedResult(message);
//        }

        return new Result(true);
    }

    @Override
    public String key() {
        return "press_element_by_desc";
    }
}
