package com.iigeo.gisalg;

/**
 * 计算几何算法
 */
public class GISAlg {


    /**
     *
     * @param point  判断点
     * @param points 多边形的顶点集合
     * @return
     */
    public boolean pointInPoly(Point point ,Point[] points){
        boolean isContains=false;
        int end=points.length-1;
        for (int i=0;i<points.length;i++){
            //通过判断点的y坐标和每条边的两个端点的y坐标比较，判断点是否在这条边的中间
            if (point.getY()>points[i].getY()&&point.getY()<=points[end].getY()||point.getY()<=points[i].getY()&&point.getY()>=points[end].getY()){
                //计算交点的x坐标值，如果小于x则记为一次
                if((point.getY()-points[i].getY())/(points[end].getY()-points[i].getY())*(points[end].getX()-points[i].getX())+points[i].getX()<point.getX()){
                    isContains=!isContains;
                }
            }
            //移动顶点位置，相邻的两个点构成一条边
            end=i;
        }
        return isContains;

    }
}
