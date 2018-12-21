package com.sgf.user.lambdamodel;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by yuers on 2018/12/19.
 */
public class Test02 {
    public static void main(String[] args) {
        aa();
    }

    private static class VideoInfo {
        String id;
        int width;
        int height;

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof VideoInfo)) {
                return false;
            }
            VideoInfo vi = (VideoInfo) obj;
            return this.id.equals(vi.getId())
                    && this.height == vi.height
                    && this.width == vi.width;
        }

        @Override
        public int hashCode(){
            int n = 31;
            n = n * 31 + this.id.hashCode();
            n = n * 31 + this.height;
            n = n * 31 + this.width;
            return n;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public VideoInfo(String id, int width, int height) {
            this.id = id;
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString(){
            return id+","+width+","+height;
        }
    }

    public static void aa() {
        List<VideoInfo> list = Arrays.asList(
                new VideoInfo("123", 1, 2),
                new VideoInfo("456", 4, 5),
                new VideoInfo("123", 1, 2)
        );
        Map<String, VideoInfo> map = list.stream().collect(Collectors.toMap(VideoInfo::getId, x -> x, (oldValue, newValue) -> newValue));
        map.forEach((x, y) -> System.out.println("<" + x + "===" + y + ">"));
        Map<String, VideoInfo> id2VideoInfo2 = list.stream().distinct().collect(
                Collectors.toMap(VideoInfo::getId, x -> x)
        );
    }
}
