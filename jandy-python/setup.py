from setuptools import setup

setup(
    name='jandy-python',
    version='0.1.1-SNAPSHOT',
    url='https://github.com/jcooky/jandy/jandy-python',
    license='GPL',
    author='JCooky',
    author_email='bak723@gmail.com',
    description='Jandy Profiler for the Python',
    packages=['jandy'],
    scripts=['scripts/jandy'],
    test_suite='tests',
    install_requires=['wheel', 'thrift', 'uuid', 'PyYAML', 'poster']
)
