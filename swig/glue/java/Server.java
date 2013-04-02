/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.jni.core;

public class Server extends ServerInfo {
  private long swigCPtr;

  protected Server(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.Server_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Server obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_Server(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setGui_label(String value) {
    otapiJNI.Server_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.Server_gui_label_get(swigCPtr, this);
  }

  public void setServer_id(String value) {
    otapiJNI.Server_server_id_set(swigCPtr, this, value);
  }

  public String getServer_id() {
    return otapiJNI.Server_server_id_get(swigCPtr, this);
  }

  public void setServer_type(String value) {
    otapiJNI.Server_server_type_set(swigCPtr, this, value);
  }

  public String getServer_type() {
    return otapiJNI.Server_server_type_get(swigCPtr, this);
  }

  public void setServer_host(String value) {
    otapiJNI.Server_server_host_set(swigCPtr, this, value);
  }

  public String getServer_host() {
    return otapiJNI.Server_server_host_get(swigCPtr, this);
  }

  public void setServer_port(String value) {
    otapiJNI.Server_server_port_set(swigCPtr, this, value);
  }

  public String getServer_port() {
    return otapiJNI.Server_server_port_get(swigCPtr, this);
  }

  public static Server ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.Server_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new Server(cPtr, false);
  }

}
