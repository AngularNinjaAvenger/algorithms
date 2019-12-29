class MaxBinaryHeap:
	def __init__(self):
		self.values = []
	
	def insert(self,value):
		self.values.append(value)
		self.bubbleUP()
		return self
	def bubbleUP(self):
		 idx = 0
		 g = len(self.values)
		 while idx < len(self.values):
		 	pass

x = MaxBinaryHeap();

x.insert(10).insert(15).insert(12).insert(50)


print(x.values)

class jQuery:
    def __int__(self):
        self.events={}
    def on(self,event,callback):
        if(self.events[event]):
            self.events[event].append(callback)
            return 
        self.event[event]=[callback]
    def trigger(self,event):
        if self.events[event]:
            for i in self.events[event]:
                i()
    def off(event):
        if self.events[event]:
            del self.events[event]

def pop():
    print("what popaig")
jQuery().on("click",pop)

def harmlesRansomNote(text,mag):
    t = list(text)
    m = list(mag)
    dic = {}
    for i in t:
        if not i in dic.keys():
            dic[i]=0
        dic[i]+=1
    can_work = True
    for i in m:
        if i not in dic.keys():
            can_work = False
            break
        else:
            dic[i]-=1
            if dic[i] < 0:
                can_work =False
                break
    print(dic,can_work)

    #     if not dic[i]:
    #         dic[i]=1
    #     dic[i]+=1
    
harmlesRansomNote("etedxt","etext")


def binarySearch(array,item):
    middleIndex = int(len(array)/2)
    middleItem = array[middleIndex]
    if middleItem == item:
        return True
    elif middleItem > item and len(array) >1:
        return binarySearch(array[0:middleIndex],item)
    elif middleItem < item and len(array) >1:
        return binarySearch(array[middleIndex:],item)
    else:
        return False

def bubbleSort(ary):
    for i in range(-len(ary),0):
        i = -i
        for j in range(i):
            if i+1 >len(ary):
                if ary[i] >ary[i+1]:
                    temp = ary[i]
                    ary[i] = ary[i+1]
                    ary[i+1] = temp
    return ary

print(bubbleSort([3,2,1]))


# ceaserChipher