package reach_test;

import com.thoughtworks.xstream.XStream;

class Test {

  public void foo(String s) {
    XStream stream = new XStream();

    stream.fromXML(s);
  }
}
