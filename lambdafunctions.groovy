def functions = [
  [name: 'create-s3', runtime: 'python3.8', handler: 'lambda_function.lambda_handler', role: 'arn:aws:iam::834829128384:role/RoleForLambda'],
  [name: 'lambda-basics', runtime: 'python3.8', handler: 'lambda_function.lambda_handler', role: 'arn:aws:iam::834829128384:role/RoleForLambda']
]
return functions
