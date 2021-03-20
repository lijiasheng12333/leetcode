# leetcode
数据结构与算法总结
===========

__常用算法__
-
* __快速排序__  
	* 快速算法其实可以看成是一种改进了的冒泡算法  
	__基本思想__:首先第一次排序，将数据分隔成两块,其中一块的局数要比另一块中的所有数据小，这两块数据在左在右根据你需要从大到小还是从小到大进行排列的需求来定。然后再次分别对两块数据进行同样的操作。最后直到所有数据变成有序为止。     
![快速排序图例](https://github.com/lijiasheng12333/leetcode/blob/main/pic/quickSort.png)

	[代码实现](https://github.com/lijiasheng12333/leetcode/tree/main/src/quickSort)

* __归并排序__  
	* 归并排序采用的是分治策略  
	__基本思想__:首先将数据细分为2组，然后再次基础上继续细分，最后分到每组只有一个的情况下，22为一组比较大小，大的在左边，小的在右边，然后合起来，继续22一组进行比较并移动，直到合成一组     
![归并排序图例1](https://github.com/lijiasheng12333/leetcode/blob/main/pic/mergeSort.png)
![归并排序图例2](https://github.com/lijiasheng12333/leetcode/blob/main/pic/mergeSort2.png)

	[代码实现]()
