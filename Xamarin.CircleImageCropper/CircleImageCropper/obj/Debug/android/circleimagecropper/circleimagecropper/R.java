/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package circleimagecropper.circleimagecropper;

public final class R {
    public static final class array {
        public static final int showGuidelinesArray=0x7f080000;
    }
    public static final class attr {
        /** <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int aspectRatioX=0x7f010002;
        /** <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int aspectRatioY=0x7f010003;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int fixAspectRatio=0x7f010001;
        /** <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>on</code></td><td>2</td><td></td></tr>
<tr><td><code>onTouch</code></td><td>1</td><td></td></tr>
<tr><td><code>off</code></td><td>0</td><td></td></tr>
</table>
         */
        public static final int guidelines=0x7f010000;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int imageResource=0x7f010004;
    }
    public static final class color {
        public static final int black_translucent=0x7f050000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 
         */
        public static final int activity_horizontal_margin=0x7f060000;
        public static final int activity_vertical_margin=0x7f060001;
        public static final int textSize=0x7f060002;
    }
    public static final class drawable {
        public static final int bkg=0x7f020000;
        public static final int butterfly=0x7f020001;
        public static final int ic_launcher=0x7f020002;
        public static final int icon=0x7f020003;
        public static final int sidewayssky=0x7f020004;
        public static final int violetsky=0x7f020005;
    }
    public static final class id {
        public static final int CropOverlayView=0x7f040004;
        public static final int ImageView_image=0x7f040003;
        public static final int off=0x7f040002;
        public static final int on=0x7f040000;
        public static final int onTouch=0x7f040001;
    }
    public static final class layout {
        public static final int crop_image_view=0x7f030000;
    }
    public static final class string {
        public static final int action_settings=0x7f070002;
        public static final int app_name=0x7f070000;
        public static final int aspectRatioX=0x7f070004;
        public static final int aspectRatioXHeader=0x7f070005;
        public static final int aspectRatioY=0x7f070006;
        public static final int aspectRatioYHeader=0x7f070007;
        public static final int crop=0x7f070009;
        public static final int croppedImageDesc=0x7f07000b;
        public static final int fixedAspectRatio=0x7f070003;
        public static final int rotate=0x7f07000a;
        public static final int showGuidelines=0x7f070008;
        public static final int title=0x7f070001;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f090000;
        /**  Application theme. 
         */
        public static final int AppTheme=0x7f090001;
        /**  All customizations that are NOT specific to a particular API-level can go here. 
 Robo Theme. 
         */
        public static final int RoboTheme=0x7f090002;
    }
    public static final class styleable {
        /** Attributes that can be used with a CropImageView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #CropImageView_aspectRatioX CircleImageCropper.CircleImageCropper:aspectRatioX}</code></td><td></td></tr>
           <tr><td><code>{@link #CropImageView_aspectRatioY CircleImageCropper.CircleImageCropper:aspectRatioY}</code></td><td></td></tr>
           <tr><td><code>{@link #CropImageView_fixAspectRatio CircleImageCropper.CircleImageCropper:fixAspectRatio}</code></td><td></td></tr>
           <tr><td><code>{@link #CropImageView_guidelines CircleImageCropper.CircleImageCropper:guidelines}</code></td><td></td></tr>
           <tr><td><code>{@link #CropImageView_imageResource CircleImageCropper.CircleImageCropper:imageResource}</code></td><td></td></tr>
           </table>
           @see #CropImageView_aspectRatioX
           @see #CropImageView_aspectRatioY
           @see #CropImageView_fixAspectRatio
           @see #CropImageView_guidelines
           @see #CropImageView_imageResource
         */
        public static final int[] CropImageView = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004
        };
        /**
          <p>This symbol is the offset where the {@link CircleImageCropper.CircleImageCropper.R.attr#aspectRatioX}
          attribute's value can be found in the {@link #CropImageView} array.


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name CircleImageCropper.CircleImageCropper:aspectRatioX
        */
        public static final int CropImageView_aspectRatioX = 2;
        /**
          <p>This symbol is the offset where the {@link CircleImageCropper.CircleImageCropper.R.attr#aspectRatioY}
          attribute's value can be found in the {@link #CropImageView} array.


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name CircleImageCropper.CircleImageCropper:aspectRatioY
        */
        public static final int CropImageView_aspectRatioY = 3;
        /**
          <p>This symbol is the offset where the {@link CircleImageCropper.CircleImageCropper.R.attr#fixAspectRatio}
          attribute's value can be found in the {@link #CropImageView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name CircleImageCropper.CircleImageCropper:fixAspectRatio
        */
        public static final int CropImageView_fixAspectRatio = 1;
        /**
          <p>This symbol is the offset where the {@link CircleImageCropper.CircleImageCropper.R.attr#guidelines}
          attribute's value can be found in the {@link #CropImageView} array.


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>on</code></td><td>2</td><td></td></tr>
<tr><td><code>onTouch</code></td><td>1</td><td></td></tr>
<tr><td><code>off</code></td><td>0</td><td></td></tr>
</table>
          @attr name CircleImageCropper.CircleImageCropper:guidelines
        */
        public static final int CropImageView_guidelines = 0;
        /**
          <p>This symbol is the offset where the {@link CircleImageCropper.CircleImageCropper.R.attr#imageResource}
          attribute's value can be found in the {@link #CropImageView} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name CircleImageCropper.CircleImageCropper:imageResource
        */
        public static final int CropImageView_imageResource = 4;
    };
}