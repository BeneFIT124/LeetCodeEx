package org.example

var ti = TreeNode(5)
var v = ti.`val`

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
    fun checkTree(root: TreeNode?): Boolean {
        return root?.left!!.`val` + root.right!!.`val` == root.`val`
    }

