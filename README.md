#CircleProgressBarView
A library Show the progress with circleBar feature.一个展示圆形进度条的开源库
##Demo
![](https://github.com/CaoyangLee/CircleProgressBarView/blob/master/circleProgressBarView.gif)


## Usage

```Xml
<!--recyclerView中建议使isAutoAnimation属性为false，手动控制开始动画-->
<io.weimu.www.CircleProgressBarView
android:id="@+id/crv_01"
android:layout_width="88dp"
android:layout_height="88dp"
android:layout_marginTop="8dp"
app:backgroundColor="#ffffff"
app:animationTime="2000"
app:isShowAnimation="true"
app:isShowText="true"
app:isAutoAnimation="false"
app:progressBarBackgroundColor="#f6f6f6"
app:progressBarColor="#2599ea"
app:progressBarWidth="5dp"
app:progressValue="95"
app:textColor="#2599ea"
app:isFanShaped="true"
app:textSize="16sp" />
```
###Attributes

|name|format|description|
|:---:|:---:|:---:|
| backgroundColor | color | 背景颜色
| progressBarColor | color | 进度条颜色
| progressBarBackgroundColor | color | 进度条背景颜色
| progressBarWidth | dimension | 进度条宽度
| progressValue | integer |百分比 最大值为100
| isShowAnimation | boolean |是否需要动画
| isAutoAnimation | boolean |是否需要自动启动动画
| animationTime | integer | 动画时间
| textSize | dimension | 是否显示百分比文本
| textColor | color | 百分比文本颜色
| isShowText | boolean | 是否显示文本
| isFanShaped | boolean | 是否为扇形

##Gradle

```Jcenter
dependencies{
    compile 'com.weimu:circle-progressbar-view:1.0.0'
}
```

