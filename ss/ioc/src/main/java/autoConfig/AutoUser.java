package autoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Spring管理的Bean我们需要通过@Autowired或者@Resource导入来使用，
// 这两的区别啥的你可以自己去搜索一下，这里只简单说一个问题。@Autowired是按照类型装配的
// ，@Resource是按照名称装配的，加入同一类型有多个bean，只是名字不一样，
// @Autowired直接导入会报错。这时候课题通过@Resource(name="name")
// 或者@Autowired@Qualifier("name")来按名称装配，解决问题

@Component
public class AutoUser{

    @Autowired
    AutoTest autoTest;

    private String name = "eddy";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String test() {
        return autoTest.getName();
    }
}
