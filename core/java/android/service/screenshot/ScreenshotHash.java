/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.service.screenshot;

import android.annotation.NonNull;
import android.annotation.SystemApi;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

import com.android.internal.util.DataClass;

/**
 * The screenshot hash used to validate information about what was present on screen.
 * @hide
 *
 * TODO: Remove hide and SystemAPI since this will be a public class
 */
@SystemApi
@DataClass(genToString = true, genAidl = true)
public final class ScreenshotHash implements Parcelable {
    /**
     * The timestamp when the screenshot was generated.
     */
    private final long mScreenshotTimeMillis;

    /**
     * The bounds of the requested area to take the screenshot. This is in window space passed in
     * by the client.
     */
    @NonNull
    private final Rect mBoundsInWindow;

    /**
     * The selected hashing algorithm that generated the image hash.
     */
    @NonNull
    private final String mHashingAlgorithm;

    /**
     * The image hash generated when creating the ScreenshotHash from the screenshot taken.
     */
    @NonNull
    private final byte[] mImageHash;

    /**
     * The hmac generated by the system and used to verify whether this token was generated by
     * the system. This should only be accessed by a system process.
     */
    @NonNull
    private final byte[] mHmac;

    /**
     * The hmac generated by the system and used to verify whether this token was generated by
     * the system. This should only be accessed by a system process.
     *
     * @hide
     */
    @SystemApi
    @NonNull
    public byte[] getHmac() {
        return mHmac;
    }



    // Code below generated by codegen v1.0.22.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/core/java/android/service/screenshot
    // /ScreenshotHash.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    /**
     * Creates a new ScreenshotHash.
     *
     * @param screenshotTimeMillis
     *   The timestamp when the screenshot was generated.
     * @param boundsInWindow
     *   The bounds of the requested area to take the screenshot. This is in window space passed in
     *   by the client.
     * @param hashingAlgorithm
     *   The selected hashing algorithm that generated the image hash.
     * @param imageHash
     *   The image hash generated when creating the ScreenshotHash from the screenshot taken.
     * @param hmac
     *   The hmac generated by the system and used to verify whether this token was generated by
     *   the system. This should only be accessed by a system process.
     */
    @DataClass.Generated.Member
    public ScreenshotHash(
            long screenshotTimeMillis,
            @NonNull Rect boundsInWindow,
            @NonNull String hashingAlgorithm,
            @NonNull byte[] imageHash,
            @NonNull byte[] hmac) {
        this.mScreenshotTimeMillis = screenshotTimeMillis;
        this.mBoundsInWindow = boundsInWindow;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mBoundsInWindow);
        this.mHashingAlgorithm = hashingAlgorithm;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mHashingAlgorithm);
        this.mImageHash = imageHash;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mImageHash);
        this.mHmac = hmac;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mHmac);

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * The timestamp when the screenshot was generated.
     */
    @DataClass.Generated.Member
    public long getScreenshotTimeMillis() {
        return mScreenshotTimeMillis;
    }

    /**
     * The bounds of the requested area to take the screenshot. This is in window space passed in
     * by the client.
     */
    @DataClass.Generated.Member
    public @NonNull Rect getBoundsInWindow() {
        return mBoundsInWindow;
    }

    /**
     * The selected hashing algorithm that generated the image hash.
     */
    @DataClass.Generated.Member
    public @NonNull String getHashingAlgorithm() {
        return mHashingAlgorithm;
    }

    /**
     * The image hash generated when creating the ScreenshotHash from the screenshot taken.
     */
    @DataClass.Generated.Member
    public @NonNull byte[] getImageHash() {
        return mImageHash;
    }

    @Override
    @DataClass.Generated.Member
    public String toString() {
        // You can override field toString logic by defining methods like:
        // String fieldNameToString() { ... }

        return "ScreenshotHash { " +
                "screenshotTimeMillis = " + mScreenshotTimeMillis + ", " +
                "boundsInWindow = " + mBoundsInWindow + ", " +
                "hashingAlgorithm = " + mHashingAlgorithm + ", " +
                "imageHash = " + java.util.Arrays.toString(mImageHash) + ", " +
                "hmac = " + java.util.Arrays.toString(mHmac) +
        " }";
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        dest.writeLong(mScreenshotTimeMillis);
        dest.writeTypedObject(mBoundsInWindow, flags);
        dest.writeString(mHashingAlgorithm);
        dest.writeByteArray(mImageHash);
        dest.writeByteArray(mHmac);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ ScreenshotHash(@NonNull Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        long screenshotTimeMillis = in.readLong();
        Rect boundsInWindow = (Rect) in.readTypedObject(Rect.CREATOR);
        String hashingAlgorithm = in.readString();
        byte[] imageHash = in.createByteArray();
        byte[] hmac = in.createByteArray();

        this.mScreenshotTimeMillis = screenshotTimeMillis;
        this.mBoundsInWindow = boundsInWindow;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mBoundsInWindow);
        this.mHashingAlgorithm = hashingAlgorithm;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mHashingAlgorithm);
        this.mImageHash = imageHash;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mImageHash);
        this.mHmac = hmac;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mHmac);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<ScreenshotHash> CREATOR
            = new Parcelable.Creator<ScreenshotHash>() {
        @Override
        public ScreenshotHash[] newArray(int size) {
            return new ScreenshotHash[size];
        }

        @Override
        public ScreenshotHash createFromParcel(@NonNull Parcel in) {
            return new ScreenshotHash(in);
        }
    };

    @DataClass.Generated(
            time = 1612383172822L,
            codegenVersion = "1.0.22",
            sourceFile = "frameworks/base/core/java/android/service/screenshot/ScreenshotHash.java",
            inputSignatures = "private final  long mScreenshotTimeMillis\nprivate final @android.annotation.NonNull android.graphics.Rect mBoundsInWindow\nprivate final @android.annotation.NonNull java.lang.String mHashingAlgorithm\nprivate final @android.annotation.NonNull byte[] mImageHash\nprivate final @android.annotation.NonNull byte[] mHmac\npublic @android.annotation.SystemApi @android.annotation.NonNull byte[] getHmac()\nclass ScreenshotHash extends java.lang.Object implements [android.os.Parcelable]\n@com.android.internal.util.DataClass(genToString=true, genAidl=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
