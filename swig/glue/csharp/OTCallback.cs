/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace org.opentransactions.otapi {

using System;
using System.Runtime.InteropServices;

public class OTCallback : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal OTCallback(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(OTCallback obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~OTCallback() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          otapiPINVOKE.delete_OTCallback(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public OTCallback() : this(otapiPINVOKE.new_OTCallback(), true) {
    SwigDirectorConnect();
  }

  public virtual void runOne(string szDisplay, OTPassword theOutput) {
    if (SwigDerivedClassHasMethod("runOne", swigMethodTypes0)) otapiPINVOKE.OTCallback_runOneSwigExplicitOTCallback(swigCPtr, szDisplay, OTPassword.getCPtr(theOutput)); else otapiPINVOKE.OTCallback_runOne(swigCPtr, szDisplay, OTPassword.getCPtr(theOutput));
    if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
  }

  public virtual void runTwo(string szDisplay, OTPassword theOutput) {
    if (SwigDerivedClassHasMethod("runTwo", swigMethodTypes1)) otapiPINVOKE.OTCallback_runTwoSwigExplicitOTCallback(swigCPtr, szDisplay, OTPassword.getCPtr(theOutput)); else otapiPINVOKE.OTCallback_runTwo(swigCPtr, szDisplay, OTPassword.getCPtr(theOutput));
    if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
  }

  private void SwigDirectorConnect() {
    if (SwigDerivedClassHasMethod("runOne", swigMethodTypes0))
      swigDelegate0 = new SwigDelegateOTCallback_0(SwigDirectorrunOne);
    if (SwigDerivedClassHasMethod("runTwo", swigMethodTypes1))
      swigDelegate1 = new SwigDelegateOTCallback_1(SwigDirectorrunTwo);
    otapiPINVOKE.OTCallback_director_connect(swigCPtr, swigDelegate0, swigDelegate1);
  }

  private bool SwigDerivedClassHasMethod(string methodName, Type[] methodTypes) {
    System.Reflection.MethodInfo methodInfo = this.GetType().GetMethod(methodName, System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.NonPublic | System.Reflection.BindingFlags.Instance, null, methodTypes, null);
    bool hasDerivedMethod = methodInfo.DeclaringType.IsSubclassOf(typeof(OTCallback));
    return hasDerivedMethod;
  }

  private void SwigDirectorrunOne(string szDisplay, IntPtr theOutput) {
    runOne(szDisplay, new OTPassword(theOutput, false));
  }

  private void SwigDirectorrunTwo(string szDisplay, IntPtr theOutput) {
    runTwo(szDisplay, new OTPassword(theOutput, false));
  }

  public delegate void SwigDelegateOTCallback_0(string szDisplay, IntPtr theOutput);
  public delegate void SwigDelegateOTCallback_1(string szDisplay, IntPtr theOutput);

  private SwigDelegateOTCallback_0 swigDelegate0;
  private SwigDelegateOTCallback_1 swigDelegate1;

  private static Type[] swigMethodTypes0 = new Type[] { typeof(string), typeof(OTPassword) };
  private static Type[] swigMethodTypes1 = new Type[] { typeof(string), typeof(OTPassword) };
}

}
