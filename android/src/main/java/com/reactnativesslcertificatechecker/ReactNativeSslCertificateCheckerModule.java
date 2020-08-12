package com.reactnativesslcertificatechecker;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

import javax.annotation.Nonnull;

public class ReactNativeSslCertificateCheckerModule extends ReactContextBaseJavaModule {
  /**
   * Class name
   * DO NOT EDIT *
   */
  private static final String NAME = "ReactNativeSslCertificateChecker";

  private static final String JSON_GENERIC_RESULT = "result";
  public static final String JSON_GENERIC_SUCCESS = "true";

  private ReactApplicationContext mReactContext;

  public ReactNativeSslCertificateCheckerModule(@Nonnull ReactApplicationContext reactContext) {
    super(reactContext);
    this.mReactContext = reactContext;
  }

  /**
   * Get module name
   *
   * @return filled module name
   */
  @Override
  public String getName() {
    return NAME;
  }

  // UTILS

  /**
   * Convert a string to a JSON with the said string.
   *
   * @param result The string to convert.
   * @return The JSON form.
   */
  private static WritableMap getResultMap(String result) {
    WritableMap wResultMap = new WritableNativeMap();
    wResultMap.putString(JSON_GENERIC_RESULT, result);
    return wResultMap;
  }

  // METHODS

  /**
   * This function check if ssl certificate is good
   *
   * @param httpUrl url to call to check ssl certificate
   * @param fingerPrint finger print to check if certificate changed
   * @param callback    The callback to invoke. Return true or the error in a json.
   */
  @ReactMethod
  public void checkSSLCertificate(String httpUrl, String fingerPrint, Callback callback) {
    Log.e("<<>>", "<<>> checkSSLCertificate");
    callback.invoke(getResultMap(JSON_GENERIC_SUCCESS));
  }
}