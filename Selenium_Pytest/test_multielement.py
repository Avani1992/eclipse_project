import pytest
import time

def test_multiElement(test_common,test_googleurl):
    test_common[0].find_element_by_name('q').send_keys('manual')
    time.sleep(7)
    lists=test_common[0].find_elements_by_xpath("//span[contains(.,'manual')]")  # list of all links which contain manual in it.

    size=len(lists)

    for i in range(0,size):
        text=lists[i].text  # retrieve text from list.
        print(text)

    test_common[0].close()