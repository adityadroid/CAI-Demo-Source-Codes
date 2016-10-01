/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/adi/ADITYA/adt-bundle-linux-x86_64-20140702/workspace/android_packages_apps_Dialer-cm-13.0/app/src/main/aidl/com/android/services/callrecorder/common/ICallRecorderService.aidl
 */
package com.android.services.callrecorder.common;
/**
 * Service for recording phone calls.  Only one recording may be active at a time
 * (i.e. every call to startRecording should be followed by a call to stopRecording).
 */
public interface ICallRecorderService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.services.callrecorder.common.ICallRecorderService
{
private static final java.lang.String DESCRIPTOR = "com.android.services.callrecorder.common.ICallRecorderService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.services.callrecorder.common.ICallRecorderService interface,
 * generating a proxy if needed.
 */
public static com.android.services.callrecorder.common.ICallRecorderService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.services.callrecorder.common.ICallRecorderService))) {
return ((com.android.services.callrecorder.common.ICallRecorderService)iin);
}
return new com.android.services.callrecorder.common.ICallRecorderService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_startRecording:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
boolean _result = this.startRecording(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopRecording:
{
data.enforceInterface(DESCRIPTOR);
com.android.services.callrecorder.common.CallRecording _result = this.stopRecording();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_isRecording:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isRecording();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActiveRecording:
{
data.enforceInterface(DESCRIPTOR);
com.android.services.callrecorder.common.CallRecording _result = this.getActiveRecording();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.services.callrecorder.common.ICallRecorderService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Start a recording.
     *
     * @return true if recording started successfully
     */
@Override public boolean startRecording(java.lang.String phoneNumber, long creationTime) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(phoneNumber);
_data.writeLong(creationTime);
mRemote.transact(Stub.TRANSACTION_startRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * stops the current recording
     *
     * @return call recording data including the output filename
     */
@Override public com.android.services.callrecorder.common.CallRecording stopRecording() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.services.callrecorder.common.CallRecording _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopRecording, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.services.callrecorder.common.CallRecording.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Recording status
     *
     * @return true if there is an active recording
     */
@Override public boolean isRecording() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get recording currently in progress
     *
     * @return call recording object
     */
@Override public com.android.services.callrecorder.common.CallRecording getActiveRecording() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.services.callrecorder.common.CallRecording _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveRecording, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.services.callrecorder.common.CallRecording.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_startRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getActiveRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Start a recording.
     *
     * @return true if recording started successfully
     */
public boolean startRecording(java.lang.String phoneNumber, long creationTime) throws android.os.RemoteException;
/**
     * stops the current recording
     *
     * @return call recording data including the output filename
     */
public com.android.services.callrecorder.common.CallRecording stopRecording() throws android.os.RemoteException;
/**
     * Recording status
     *
     * @return true if there is an active recording
     */
public boolean isRecording() throws android.os.RemoteException;
/**
     * Get recording currently in progress
     *
     * @return call recording object
     */
public com.android.services.callrecorder.common.CallRecording getActiveRecording() throws android.os.RemoteException;
}
