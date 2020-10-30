const express = require('express')
const bodyParser = require('body-parser')

const app = express()
const port = 3000 || process.env.PORT

app.use(bodyParser.urlencoded({extended: true}))
app.use(bodyParser.json())
app.use(express.json())

app.get('/', (req, res, next) => {
    res.send('Hello World!')
})

app.listen(port, () => {
    console.log('Listening to port ' + port)
})