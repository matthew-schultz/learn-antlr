import sys
from antlr4 import *
from SQLiteLexer import SQLiteLexer
from SQLiteParser import SQLiteParser
# from HtmlSQLiteListener import HtmlSQLiteListener
 
def main(argv):
    input = FileStream(argv[1])
    lexer = SQLiteLexer(input)
    stream = CommonTokenStream(lexer)
    parser = SQLiteParser(stream)
    tree = parser.SQLite()
 
    output = open("output.html","w")
    
#    htmlSQLite = HtmlSQLiteListener(output)
#    walker = ParseTreeWalker()
#    walker.walk(htmlSQLite, tree)
        
    output.close()      
 
if __name__ == '__main__':
    main(sys.argv)
