package com.jimlitton.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)

/*
Both stringResourceId and imageResourceId are integer values. Although this looks okay, the caller
could accidentally pass in the arguments in the wrong order (imageResourceId first instead of
stringResourceId).

To avoid this, you can use Resource annotations. Annotations are useful because they add
additional info to classes, methods, or parameters. Annotations are always declared with an @
symbol. In this case, add the @StringRes annotation to your string resource ID property and
@DrawableRes annotation to your drawable resource ID property. Then you will get a warning if you
supply the wrong type of resource ID.

Add the @StringRes annotation to stringResourceId.
Add the @DrawableRes annotation to imageResourceId
 */