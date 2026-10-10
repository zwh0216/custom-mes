package com.example.mescommon.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListUtils {

    public static <T, V> List<T> list2Tree(List<T> list, Function<T, V> idGetter, Function<T, V> parentIdGetter, Function<T, List<T>> childrenGetter, BiConsumer<T, List<T>> childrenSetter) {
        // 把数组转换成map
        Map<V, T> map = list.stream().collect(Collectors.toMap(idGetter, item -> item));

        List<T> roots = new ArrayList<T>();

        for (T item : list) {
            V id = idGetter.apply(item);
            if (id != null) {
                V parentId = parentIdGetter.apply(item);

                // 没有parentId，则表示是root节点
                if (parentId == null) {
                    roots.add(item);
                    continue;
                }

                final T parent = map.get(parentId);
                if (parent == null) {
                    continue;
                }

                // 插入父节点的子字段list中
                List<T> children = childrenGetter.apply(parent);
                if (children == null) {
                    children = new ArrayList<T>();
                    childrenSetter.accept(parent, children);
                }
                children.add(item);
            }
        }
        return roots;
    }
}
