const query = `
 Query:{
     name: String!
 }
`

const resolver = {
    name(){
        return 'Aman'
    }
}


//using graphql-yoga
