/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

public class StringMap extends Storable {
  private long swigCPtr;

  protected StringMap(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.StringMap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_StringMap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
// ------------------------
  public void setThe_map(SWIGTYPE_p_std__mapT_std__string_std__string_t value) {
    otapiJNI.StringMap_the_map_set(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_std__string_std__string_t getThe_map() {
    long cPtr = otapiJNI.StringMap_the_map_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_std__string_std__string_t(cPtr, false);
  }

  public void SetValue(String strKey, String strValue) {
    otapiJNI.StringMap_SetValue(swigCPtr, this, strKey, strValue);
  }

  public String GetValue(String strKey) {
    return otapiJNI.StringMap_GetValue(swigCPtr, this, strKey);
  }

  public static StringMap ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.StringMap_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new StringMap(cPtr, false);
  }

}
