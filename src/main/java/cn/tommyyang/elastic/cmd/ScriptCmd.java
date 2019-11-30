package cn.tommyyang.elastic.cmd;

import org.elasticsearch.script.Script;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.metrics.scripted.ScriptedMetricAggregationBuilder;
import org.glassfish.grizzly.http.server.util.RequestUtils;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/11/15 10:22 AM
 * @Software: IntelliJ IDEA
 */
public class ScriptCmd {

    public static void main(String[] args) {
//        ScriptedMetricAggregationBuilder aggregation = AggregationBuilders
//                .scriptedMetric("agg")
//                .initScript(new Script("state.heights = []"))
//                .mapScript(new Script("state.heights.add(doc.gender.value == 'male' ? doc.height.value : -1.0 * doc.height.value)"))
//                .combineScript(new Script("double heights_sum = 0.0; for (t in state.heights) { heights_sum += t } return heights_sum"))
//                .reduceScript(new Script("double heights_sum = 0.0; for (a in states) { heights_sum += a } return heights_sum"));
//        System.out.println(aggregation.toString());
//        String scriptStr = String.format("ctx._source.click_count=%d;ctx._source.impr_count=%d;ctx._source.ctr=(double)ctx._source.click_count/ctx._source.impr_count", 15, 120);
//        Script script = new Script(scriptStr);
//        System.out.println(script.toString());
    }

}
