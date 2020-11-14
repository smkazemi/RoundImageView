# RoundImageView
Simple Android Library for image rounding



![](https://github.com/smkazemi/RoundImageView/blob/main/Screenshot_2020-11-13_22-15-30.png)



### How to use 

---

**Step 1.** Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```css
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

**Step 2.** Add the dependency

```css
	dependencies {
	        implementation 'com.github.smkazemi:RoundImageView:V1.0'
	}
```



### Sample

---

```xml
// circle Image View
<ir.smr.kazemi.roundimageview.RoundImageView
    android:layout_width="wrap_content"
    android:layout_marginTop="58dp"
    android:layout_height="wrap_content"
    android:layout_gravity="center_horizontal"
    android:src="@mipmap/illustration" />

// Rectangle Image View with round corner
<ir.smr.kazemi.roundimageview.RoundImageView
	android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center_horizontal"
    android:layout_margin="8dp"
    android:src="@mipmap/illustration"
    app:radius="30dp"
    app:type="rect" />
```



### XML Attributes

---

|  Name  |         Description          |
| :----: | :--------------------------: |
| radius | radius of corners and Circle |
|  type  |          rect / cir          |

