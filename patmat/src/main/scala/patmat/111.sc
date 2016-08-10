val l = List('a','b','a')
l.groupBy(ch=>ch).map({case(ch,l:List[Char])=>(ch,l.length)})