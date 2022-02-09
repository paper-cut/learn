# 函数

## sum

格式：sum(求和区域或number)

函数详情：该函数是将其中的求和区域或者数值的值加到一起

## sumif和sumifs

格式：sumif(range,criteria,[sum_range])

函数详情，当range区域中的值满足criteria的条件时，sum_range区域的对应range区域的值会被实际求和

参数详情
<li>range:进行条件判断的区域
<li>criteria:需要匹配的语句
<li>sum_range:实际进行sum的区域

格式：sumifs(sum_range, criteria_range1, criteria1, [criteria_range2, criteria2], ...)

函数详情：当后面的criterria_range们都满足criteria时的区域对应的sum_range区域的值会被实际求和

参数详解
<li>基本类似sumif

## subtotal

格式：suntotal(function_num,ref1,ref2, ..)

函数详情：该函数会根据function_num的值相应的调用不同的工具


<li>1 AVERAGE 平均值
<li>2 COUNT 非空值单元格计数
<li>3 COUNTA 非空值单元格计数（包括字母）
<li>4 MAX 最大值
<li>5 MIN 最小值
<li>6 PRODUCT 乘积
<li>7 STDEV 标准偏差值（忽略逻辑值和文本）
<li>8 STDEVP 标准偏差值
<li>9 SUM求和
<li>10 VAR 给定样本的方差（忽略逻辑值和文本）
<li>11 VARP

## if

格式：if(条件判断, 结果为真返回值, 结果为假返回值)

函数详情：如同格式一样，会进行条件判断，不同的结果返回不同的值

同时可以进行嵌套

格式：if(条件判断, if(条件判断, 结果为真返回值, 结果为假返回值), 结果为假返回值)

## index

格式：index(array,row_num,[column_num])

函数详情：该参数是在array区域中，获取row_num行，column_num处的单元格中的数据

参数详解
<li>array:人为圈定的单元格区域
<li>row_num:在该区域中的row_num行
<li>column_num:在该区域中的column_num列

## match

格式：match(lookup_value,lookup_array,[match_type])

函数详情：该参数获取lookup_value这一值在lookup_array这一数组或区域中的位置(行数或列数)

参数详解
<li>lookup_value:要匹配的内容
<li>lookup_array:要匹配的区域
<li>match_type:可选参数，指定如何查找，默认1

## lookup

格式：lookup(lookup_value,lookup_vector,result_vector)

函数详情：该函数通过获取lookup_value在lookup_vector这一数组或向量中的位置，从result_vector这一数组或向量中提取统一位置的数据

函数详解
<li>lookup_value:要匹配的内容
<li>lookup_vector:要匹配的数组或向量
<li>result_vector:要提取结果的数组或向量

