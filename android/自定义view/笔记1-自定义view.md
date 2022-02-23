# 自定义view

要求：
1.属性在XML文件里面可以配置
2.属性在java代码中可以配置

## TypedArray对象

获取方式：context.obtainStyledAttributes(attrs,R.styleable.xxx)

注意：通过TypedArray获取完属性后，需要使用recycle方法重置

## onMessure方法

protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)

onMessure方法确定了view的宽度和高度，其中的widthMasureSpec和heightMeasureSpec两个参数分别是view宽度和高度的模式+数值组合而成的一个int类型的值

模式有：
- MeasureSpec.EXACTLY:对应固定值和match_parent
- MeasureSpec.AT_MOST:对应wrap_content

可以通过：
- MeasureSpec.getMode(widthMeasureSpec);
- MeasureSpec.getSize(widthMeasureSpec);

来获得对应的模式和数值

同时，若是有padding等值，也需要通过getPaddingTop()等方法获取。

最后，通过方法
- setMeasuredDimension(width,height);

来设定view的宽度和高度

若是对于viewGroup来说，不仅需要注意模式和数值，还需要注意子view的状态，viewGroup不仅有子view的高度和宽度，还有自身的padding等。

## onLayout 方法
onLayout方法中可以完成viewGroup中的子控件的绘制（位置方面）


## onDraw 方法
实现view内部内容的绘制
on