import pytest

def test_checkboxSelected(test_checkurl,test_common):

    chkbox=test_common[0].find_element_by_id('keepLoggedInCheckBox')
    chkbox.click()
    if(chkbox.is_selected()):
        print("Yes")
    else:
        print("No")
