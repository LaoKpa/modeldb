// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;

public class AutogenQueryDatasetComponentBlobGen
    extends Generator<AutogenQueryDatasetComponentBlob> {
  public AutogenQueryDatasetComponentBlobGen() {
    super(AutogenQueryDatasetComponentBlob.class);
  }

  @Override
  public AutogenQueryDatasetComponentBlob generate(SourceOfRandomness r, GenerationStatus status) {
    // if (r.nextBoolean())
    //     return null;

    AutogenQueryDatasetComponentBlob obj = new AutogenQueryDatasetComponentBlob();
    if (r.nextBoolean()) {
      obj.setDataSourceUri(Utils.removeEmpty(new StringGenerator().generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setExecutionTimestamp(Utils.removeEmpty(gen().type(Long.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setNumRecords(Utils.removeEmpty(gen().type(Long.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setQuery(Utils.removeEmpty(new StringGenerator().generate(r, status)));
    }
    return obj;
  }
}
