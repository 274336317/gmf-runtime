//*****************************************************************************
//
//	File:		WinPrintHelper.h
//
//	Purpose:	Header file used by DiagramPrint.cpp, which will compile to
//				a DLL.
//
//	Author:		Wayne Diu, wdiu
//
//				
// Copyright (c) 2002 - 2005 IBM Corporation and others.
// This program and the accompanying materials are made
// available under the terms of the Eclipse Public License 2.0
// which is available at https://www.eclipse.org/legal/epl-2.0/
//
// SPDX-License-Identifier: EPL-2.0
//
// Contributors:
//    IBM Corporation - initial API and implementation 
//
//******************************************************************************

/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class WinPrintHelper */

#ifndef _Included_WinPrintHelper
#define _Included_WinPrintHelper
#ifdef __cplusplus
extern "C" {
#endif

/*
 * Class:     WinPrintHelper
 * Method:    initScaleFitTo
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_initScaleFitTo
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     WinPrintHelper
 * Method:    initScalePercent
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_initScalePercent
  (JNIEnv *, jclass, jint);

/*
 * Class:     WinPrintHelper
 * Method:    addDiagramString
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_addDiagramString
  (JNIEnv *, jclass, jstring);

/*
 * Class:     WinPrintHelper
 * Method:    getScaleFitToM
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getScaleFitToM
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getScaleFitToN
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getScaleFitToN
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getScalePercent
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getScalePercent
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    isDiagramSelected
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_isDiagramSelected
  (JNIEnv *, jclass, jint);

/*
 * Class:     WinPrintHelper
 * Method:    getPrintRangeAll
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getPrintRangeAll
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getPrintRangePages
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getPrintRangePages
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getDiagramPrintRangeAll
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getDiagramPrintRangeAll
(JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getDiagramPrintRangeCurrent
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getDiagramPrintRangeCurrent
(JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getDiagramPrintRangeSelection
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getDiagramPrintRangeSelection
(JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getNumberOfCopies
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getNumberOfCopies
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    open
 * Signature: (LWinPrintHelper$PrintDlgData;)Z
 */
JNIEXPORT jboolean JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_open
  (JNIEnv *, jclass, jobject);

/*
 * Class:     WinPrintHelper
 * Method:    getCollate
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getCollate
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    resetDialog
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_resetDialog
(JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getPagesFrom
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getPagesFrom
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    getPagesTo
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_getPagesTo
  (JNIEnv *, jclass);

/*
 * Class:     WinPrintHelper
 * Method:    setHwndOwner
 * Signature: (Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_setHwndOwner
(JNIEnv * env, jclass, jstring, jstring);

/*
 * Class:     WinPrintHelper
 * Method:    setOrientation
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_setOrientation
(JNIEnv * env, jclass, jboolean isLandscape);

/*
 * Class:     WinPrintHelper
 * Method:    setPaperSize
 * Signature: (IDD)V
 */
JNIEXPORT void JNICALL Java_org_eclipse_gmf_runtime_common_ui_printing_PrintHelper_setPaperSize
(JNIEnv * env, jclass, jint index, jdouble width, jdouble length);


#ifdef __cplusplus
}
#endif
#endif
