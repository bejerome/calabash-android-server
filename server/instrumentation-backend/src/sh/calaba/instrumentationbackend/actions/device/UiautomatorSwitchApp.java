//package sh.calaba.instrumentationbackend.actions.device;
//
////import android.support.test.uiautomator.UiDevice;
////import android.support.test.uiautomator.UiObjectNotFoundException;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Environment;
//import android.support.test.InstrumentationRegistry;
//
//import sh.calaba.instrumentationbackend.InstrumentationBackend;
//import sh.calaba.instrumentationbackend.Result;
//import sh.calaba.instrumentationbackend.actions.Action;
//
///**
// * Created by Benjamin Jerome on 05/03/18.
// */
//public class UiautomatorSwitchApp implements Action {
//
//    @Override
//    public Result execute(String... args) {
//        Context context =   InstrumentationRegistry.getInstrumentation().getContext();
//        Intent intent = context.getPackageManager().getLaunchIntentForPackage(args[0]);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        context.startActivity(intent);
//    }
//
//    @Override
//    public String key() {
//        return "switch_to_app";
//    }
//}
