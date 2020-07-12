
# ex 1 - implement an algorithm to determine if a string has all unique characters
def string_has_all_unique_characters(s):
    characters_seen = {}
    for character in s:
        if character in characters_seen:
            return False
        characters_seen[character] = True
    return True


assert string_has_all_unique_characters("abcdc") == False
assert string_has_all_unique_characters("abcd") == True

# ex 1.b - implement an algorithm to determine if a string has all unique characters WITHOUT ADDITIONAL DATA STRUCTURES
def string_has_all_unique_characters_without_data_structures(s):
    return len(set(s)) == len(s)

assert string_has_all_unique_characters("abcdc") == False
assert string_has_all_unique_characters("abcd") == True

assert string_has_all_unique_characters_without_data_structures("abcdc") == False
assert string_has_all_unique_characters_without_data_structures("abcd") == True
