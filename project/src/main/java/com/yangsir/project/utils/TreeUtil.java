package com.yangsir.project.utils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yangsir.project.beans.MenuBean;
import com.yangsir.project.beans.TreeNode;

public class TreeUtil {
    public static List<TreeNode> tree(List<TreeNode> nodes) {
        //递归转化为树形
         List<TreeNode> tree=new ArrayList<TreeNode>();
          for(int i=0;i<nodes.size();i++) {
        	  for(int j=i+1;j<nodes.size();j++) {
        		  if(nodes.get(j).getNum().startsWith(nodes.get(i).getNum())&&(nodes.get(j).getNum().length()-1)==nodes.get(i).getNum().length()) {
        			  nodes.get(i).getChildren().add(nodes.get(j));	  
        		  }  
        	  } 
          }
            System.out.println(nodes);   
          for (TreeNode treeNode : nodes) {
			if(treeNode.getNum().length()==2) {
				tree.add(treeNode);
			}
		}       
               
                  
            
            return tree;
    }  
    
    //转化为TreeNode节点
    public static TreeNode toNode(MenuBean menu){
        TreeNode node=new TreeNode();
        node.setId(menu.getId());
        node.setText(menu.getMenuName());
        node.setNum(menu.getMenuNum());
        return node;
    }
    public static List<TreeNode>toListNode(List<MenuBean>menus){
        List<TreeNode>nodes=new ArrayList<TreeNode>();
        for(MenuBean menu:menus){
            nodes.add(toNode(menu));
        }
        return nodes;
    }
}
