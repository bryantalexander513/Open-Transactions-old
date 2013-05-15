/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

public class TradeListMarket extends Storable {
  private long swigCPtr;

  protected TradeListMarket(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.TradeListMarket_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TradeListMarket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_TradeListMarket(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
// ------------------------
	/*@SWIG:otapi/OTAPI.i,86,OT_CONTAINER_TYPE_MEMBERS@*/
	private List elementList = new ArrayList();
/*@SWIG@*/
	/*@SWIG:otapi/OTAPI.i,163,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefTradeDataMarket(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	TradeDataMarket refActualElement = GetTradeDataMarket(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof TradeDataMarket))
			continue;

		TradeDataMarket tempRef = (TradeDataMarket)(theObject);
		
		if ((TradeDataMarket.getCPtr(tempRef) == TradeDataMarket.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefTradeDataMarket(TradeDataMarket element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof TradeDataMarket))
			continue;
		
		TradeDataMarket tempRef = (TradeDataMarket)(theObject);
		
		if ((TradeDataMarket.getCPtr(tempRef) == TradeDataMarket.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	TradeDataMarket tempLocalRef = element;
	elementList.add(tempLocalRef);
	return TradeDataMarket.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
  public long GetTradeDataMarketCount() {
    return otapiJNI.TradeListMarket_GetTradeDataMarketCount(swigCPtr, this);
  }

  public TradeDataMarket GetTradeDataMarket(long nIndex) {
    long cPtr = otapiJNI.TradeListMarket_GetTradeDataMarket(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new TradeDataMarket(cPtr, false);
  }

  public boolean RemoveTradeDataMarket(long nIndexTradeDataMarket) {
    return otapiJNI.TradeListMarket_RemoveTradeDataMarket(swigCPtr, this, removeRefTradeDataMarket(nIndexTradeDataMarket));
  }

  public boolean AddTradeDataMarket(TradeDataMarket disownObject) {
    return otapiJNI.TradeListMarket_AddTradeDataMarket(swigCPtr, this, TradeDataMarket.getCPtr(disownObject), disownObject);
  }

  public static TradeListMarket ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.TradeListMarket_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new TradeListMarket(cPtr, false);
  }

}
