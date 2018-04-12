package zemberek.morphology._analyzer;

import com.google.common.collect.Lists;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import zemberek.morphology._analyzer._Generator.GenerationResult;

public class _GeneratorTest extends AnalyzerTestBase {

  @Test
  public void testGeneration1() {
    InterpretingAnalyzer analyzer = getAnalyzer("elma");
    _Generator generator = new _Generator(analyzer);
    List<String> morphemes = Lists.newArrayList("A3pl", "P1pl");
    List<GenerationResult> results = generator.generateWithIds(
        "elma",
        morphemes
    );
    Assert.assertTrue(results.size() > 0);
    Assert.assertEquals("elmalarımız", results.get(0).surface);
  }

}