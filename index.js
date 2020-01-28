class Node{
	constructor(val){
		this.val = val;
		this.next = null;
	}
}

class LinkedList {
	constructor(){
		this.next = null;
	}
	insert(val = 10){
		let new_node = new Node(val);
		let current = this
		while(current.next != null){
			current = current.next;
		}
		current.next= new_node;
		return this;
	}
	reverse(){
		let reversed = null;
		let head = this;
		while(this.next != null){
			let nxt_node = head.next;
			head
		}
		console.log(reversed)
	}
}

let x = new LinkedList().insert(20).insert(40).insert(50).insert(60).insert(70).insert(80).insert(90);
x.reverse()




// WHAT DIJKSTRA ALGORITHM IS IT HELPS TO FIND THE SHORTEST PART 

// OF A GRAPH


// FASTING PATH

// SHORTEST PATH



// IT USES A WEIGHT GRAPH 


// class WeightedGraph {
//     constructor() {
//         this.adjacencyList = {};
//     }
//     addVertex(vertex){
//         if(!this.adjacencyList[vertex]) this.adjacencyList[vertex] = [];
//     }
//     addEdge(vertex1,vertex2, weight){
//         this.adjacencyList[vertex1].push({node:vertex2,weight});
//         this.adjacencyList[vertex2].push({node:vertex1, weight});
//     }
// }


/*

HOW DIJKSTRA WORKS

it usesa weighted graph as mentioned earilier



start by picking the node with the smallest known
distance to visit first


*/

